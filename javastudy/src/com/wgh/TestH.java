package com.wgh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestH {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception	 {
		
		
		// TODO Auto-generated method stub
		//实例化configuration
		Configuration conf = new Configuration().configure();
		//实例化sessionfactory
		SessionFactory sf = conf.buildSessionFactory();
		
		//实例化session
		
		Session sess = sf.openSession();
		//开始事务
		Transaction tx = sess.beginTransaction();
		//创建消息实例
		News n = new News();
		n.setTitle("xxx");
		n.setContent("wwwwdd");
		
		//保存消息
		sess.save(n);
		//提交事务
		tx.commit();
		
		//关闭session
		sess.close();
	}

}