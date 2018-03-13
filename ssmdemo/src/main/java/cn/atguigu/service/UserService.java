package cn.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;

import cn.atguigu.mappers.UserMapper;
import cn.atguigu.pojo.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 获取所有的用户对象
	 * 
	 * @return
	 */
	public List<User> getLists() {
		return userMapper.select(null);
	}

	/**
	 * 查询单个用户
	 * 
	 * @param id
	 * @return
	 */
	public User getUser(Integer id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	/**
	 * 添加用户
	 */
	public void addUser(User user) {
		userMapper.insertSelective(user);
	}

	/**
	 * 更新用户
	 * 
	 * @param user
	 */
	public void updateUser(User user) {
		Example example = new Example(User.class);
		example.createCriteria().andBetween("id", 1, 2);
		userMapper.updateByExampleSelective(user, example);
	}

	/**
	 * 删除用户
	 */
	public void delUser(Integer id) {
		userMapper.deleteByPrimaryKey(id);
	}
}
