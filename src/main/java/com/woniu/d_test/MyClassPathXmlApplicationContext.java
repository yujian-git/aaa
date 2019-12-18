package com.woniu.d_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MyClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext() {

	}

	Map<String, Object> map = new HashMap<String, Object>();

	public MyClassPathXmlApplicationContext(String classPath) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader
					.read(MyClassPathXmlApplicationContext.class.getClassLoader().getResourceAsStream(classPath));
			Element root = doc.getRootElement();
			Iterator<Element> it = root.elementIterator();
			while (it.hasNext()) {
				Element element = (Element) it.next();
				Attribute attrid = element.attribute("id");
				Attribute attrclazz = element.attribute("class");
				String id = attrid.getValue();
				String value = attrclazz.getValue();
				
				Object object = null;
				try {
					object = Class.forName(value).newInstance();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				map.put(id, object);
			}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object getBean(String id) {
		Object object = map.get(id);
		if (object == null) {
			throw new RuntimeException("’“≤ªµΩ");
		}
		return object;
	}
}
