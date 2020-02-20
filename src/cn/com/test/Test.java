package cn.com.test;

import java.io.IOException;
import java.util.List;

import cn.com.Interface.Dao;
import cn.com.dao.StudentDao;
import cn.com.dao.TeacherDao;
import cn.com.dao.UserDao;
import cn.com.entity.Student;
import cn.com.entity.Teacher;
import cn.com.entity.User;

public class Test {

	public static void main(String[] args) throws IOException {
		TeacherDao teacherdao = new TeacherDao();
		Teacher teacher = teacherdao.getTeacher(1);
		System.out.println(teacher.getName());
		//System.out.println(teacher);
		List<Student> list = teacher.getStudents();
		for(Student stu:list)
			System.out.println(stu);
		//StudentDao studentdao = new StudentDao();
		//List<Student> list = studentdao.getAll();
		//for(Student stu:list)
		//	System.out.println(stu);
		//Dao dao = new UserDao();
		//System.out.println(userdao.getById(1));
		
		//List<User> list = dao.getAll(1,3);
		//for(User u:list)
		//	System.out.println(u);
		
		//User user = new User();
		//user.setId(8);
		//System.out.println(userdao.add(user));
		
		//User user_update = userdao.getById(3);
		//user_update.setNumber(66666);
		//System.out.println(userdao.update(user_update));
		
		//System.out.println(userdao.delete(3));
	}

}
