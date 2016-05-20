package test.SpringMVC;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import test.entity.Person;

@Controller
public class mvcController {
	/**
	 * 测试spring页面跳转
	 * @param map
	 * @return
	 */
    @RequestMapping("/hello.do")
    public String hello(ModelMap map){
    	//测试freemarker
    	map.put("key", "value");
        return "hello";
    }
    /**
     * 测试post请求
     * @param person
     * @param pw
     */
    @RequestMapping("/get.do")
    public void get(Person person, PrintWriter pw){
    	System.out.println(person.getName());
        pw.write("hello "+person.getAge());
    }
}