package cn.atguigu.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.atguigu.pojo.User;
import cn.atguigu.service.UserService;

@Controller
public class UserControls {

	@Autowired
	UserService userService;

	/**
	 * 查找所有用户
	 * 
	 * @return
	 */
	@RequestMapping(value = "users", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getUsers() {
		List<User> lists = userService.getLists();
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(lists);

	}

	/**
	 * 查找用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {
		User user = userService.getUser(id);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "users", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> insertUser(User user) {
		userService.addUser(user);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}

	/**
	 * 更新用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "users", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<User> updateUser(User user) {
		userService.updateUser(user);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<User> delUser(@PathVariable("id") Integer id) {
		userService.delUser(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
}
