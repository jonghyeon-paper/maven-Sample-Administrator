package com.skplanet.iba.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skplanet.iba.domain.user.User;
import com.skplanet.iba.domain.user.UserService;
import com.skplanet.iba.framework.data.PagingContents;
import com.skplanet.iba.framework.data.PagingRequest;
import com.skplanet.iba.share.enumdata.ResponseCode;
import com.skplanet.iba.share.model.AjaxResponse;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/listview.do")
	public String listView() {
		return "/user/listView.page";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<User> getUserList(@RequestBody User user) {
		return userService.retrieveList(user);
	}
	
	@GetMapping("/infoview.do")
	public String infoView() {
		return "/user/infoView.page";
	}
	
	@PostMapping("/info.do")
	@ResponseBody
	public User getAuthorityInfo(@RequestBody User user) {
		return userService.retrieveUser(user);
	}
	
	@GetMapping("/writeview.do")
	public String writeView() {
		return "/user/writeView.page";
	}
	
	@PostMapping("/add.do")
	@ResponseBody
	public AjaxResponse addUser(@RequestBody User user) {
		Boolean flag = userService.addUser(user);
		
		AjaxResponse response = new AjaxResponse();
		response.setResponseCode(flag ? ResponseCode.SUCCESS : ResponseCode.FAIL);
		response.setResponseMessage(response.getResponseCode().getDescription());
		return response;
	}
	
	@PostMapping("/edit.do")
	@ResponseBody
	public AjaxResponse editUser(@RequestBody User user) {
		Boolean flag = userService.editUser(user);
		
		AjaxResponse response = new AjaxResponse();
		response.setResponseCode(flag ? ResponseCode.SUCCESS : ResponseCode.FAIL);
		response.setResponseMessage(response.getResponseCode().getDescription());
		return response;
	}
	
	@PostMapping("/remove.do")
	@ResponseBody
	public AjaxResponse removeUser(@RequestBody User user) {
		Boolean flag = userService.removeUser(user);
		
		AjaxResponse response = new AjaxResponse();
		response.setResponseCode(flag ? ResponseCode.SUCCESS : ResponseCode.FAIL);
		response.setResponseMessage(response.getResponseCode().getDescription());
		return response;
	}
	
	/**
	 * 페이지 처리된 user목록 객체를 조회
	 * @param user
	 * @param pagingRequest
	 * @return
	 */
	@RequestMapping(value = "/list.do", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	@ResponseBody
	public PagingContents<User> getUserList(User user, PagingRequest pagingRequest) {
		return userService.retrievePageList(user, pagingRequest);
	}
}
