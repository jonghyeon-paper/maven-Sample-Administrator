package bo_adm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.skplanet.iba.domain.menu.Menu;
import com.skplanet.iba.domain.menu.MenuService;
import com.skplanet.iba.share.enumdata.UseState;

public class MenuTest extends AbstractJUnit {

	@Autowired
	private MenuService menuService;
	
	@Test
	@Transactional
	public void add() throws Exception {
		Menu systemMenu = new Menu();
		systemMenu.setMenuName("System manage");
		systemMenu.setUseState(UseState.USE);
		
		menuService.addMenu(systemMenu);
		
		Menu menu = new Menu();
		menu.setMenuName("Menu manage");
		menu.setUseState(UseState.USE);
		menu.setUri("menu/view.do");
		menu.setParentMenuId(systemMenu.getMenuId());
		
		Menu user = new Menu();
		user.setMenuName("User manage");
		user.setUseState(UseState.USE);
		user.setUri("user/view.do");
		user.setParentMenuId(systemMenu.getMenuId());
		
		Menu code = new Menu();
		code.setMenuName("Code manage");
		code.setUseState(UseState.USE);
		code.setUri("code/view.do");
		code.setParentMenuId(systemMenu.getMenuId());
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(menu);
		menuList.add(user);
		menuList.add(code);
		
		menuService.addMenu(menuList);
		
		List<Menu> resultList = menuService.retrieveList(new Menu());
		print(resultList);
	}
	
	//@Test
	public void edit() {
		Menu menu = new Menu();
		menu.setMenuId(6);
		menu.setMenuName("Menu manage!!");
		menu.setUseState(UseState.UNUSE);
		
		menuService.editMenu(menu);
		
		Menu condition = new Menu();
		condition.setMenuId(6);
		Menu resultMenu = menuService.retrieveMenu(condition);
		print(resultMenu);
	}
	
	//@Test
	public void hierarchy() {
		Menu menu = menuService.getHierarchyMenu();
		print(menu);
	}
}
