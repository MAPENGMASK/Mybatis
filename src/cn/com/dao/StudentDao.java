package cn.com.dao;

import java.io.IOException;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.com.entity.Student;

import cn.com.util.MybatisUtil;



public class StudentDao  {
	public List<Student> getAll() throws IOException{
		SqlSession session = MybatisUtil.getSession();
		List<Student> list = session.selectList("cn.com.entity.student.mapper.getstudents");
		session.close();
		return list;
	}
	

}
