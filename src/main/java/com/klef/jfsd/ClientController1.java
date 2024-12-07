package com.klef.jfsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController1
{
	@GetMapping("greet")
	@ResponseBody
	public String greet(@RequestParam("username") String name)
	{
		return name;
	}
	
	@GetMapping("about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("about");
		return mv;
	}
	
	@GetMapping("demo1")
	public ModelAndView demo1(@RequestParam("age") int a,@RequestParam("country") String c)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("demo1");
		mv.addObject(a);
		mv.addObject(c);
		return mv;
	}
	
	@GetMapping("demo2/{a}/{b}")
	@ResponseBody
	public String demo2(@PathVariable("a") int x,@PathVariable("b") int y)
	{
		int sub=x-y;
		int div=x/y;
		return "Sub  "+Integer.toString(sub)+"     "+"Div  "+ Integer.toString(div);
	}
	
	@GetMapping("productform")
	public ModelAndView productform()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("productform");
		return mv;
	}
	
	@GetMapping("multiplyNumbers")
	@ResponseBody
	public ModelAndView multiplyNumbers(@RequestParam("num1")  int a,@RequestParam("num2")  int b)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("multiplyNumbers");
		mv.addObject("Mul", a*b);
		return mv;
	}
	
	@GetMapping("reverse")
	public ModelAndView reverse(@RequestParam("str1")  int a,@RequestParam("str2")  int b)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("reverse");
		mv.addObject("Number1", b);
		mv.addObject("Number2", a);
		return mv;
	}
	
	@GetMapping("calculate")
	@ResponseBody
	public ModelAndView calculate(@RequestParam("num1")  int a,@RequestParam("num2")  int b)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("calculate");
		mv.addObject("Add", a+b);
		mv.addObject("Sub", a-b);
		return mv;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@RequestMapping(path="/",method = RequestMethod.GET)
//	public ModelAndView demo()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("demo");
//		return mv;
//	}
//	@GetMapping(path="demo1")
//	public ModelAndView demo1()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("demo1");
//		return mv;
//	}
//	@GetMapping("demo2")
//	public ModelAndView demo2()
//	{
//		ModelAndView mv=new ModelAndView("demo2");
//		return mv;
//	}
//	
//	@GetMapping("test")
//	@ResponseBody
//	public String test()
//	{
//		return "KL University";
//	}
//	
//	@GetMapping("displayid")
//	@ResponseBody
//	public String displayid(@RequestParam("eid")  int id)
//	{
//		return Integer.toString(id);
//	}
//	@GetMapping("add")
//	@ResponseBody
//	public String add(@RequestParam("x")  int a,@RequestParam("y")  int b)
//	{
//		int c=a+b;
//		return Integer.toString(c);
//	}
//	
//	@GetMapping("displayname")
//	@ResponseBody
//	public String displayname(@RequestParam("fname")  String a,@RequestParam("lname")  String b)
//	{
//		String c=a+" "+b;
//		return c;
//	}
//	
//	@GetMapping("viewid/{id}")
//	@ResponseBody
//	public String viewid(@PathVariable("id")  int eid)
//	{
//		
//		return Integer.toString(eid);
//	}
//	
//	@GetMapping("sub/{x}/{y}")
//	@ResponseBody
//	public String sub(@PathVariable("x")  int a,@PathVariable("y")  int b)
//	{
//		int c=a-b;
//		return Integer.toString(c);
//	}
//	
//	@GetMapping("viewname/{fname}/{lname}")
//	@ResponseBody
//	public String viewname(@PathVariable("fname")  String a,@PathVariable("lname")  String b)
//	{
//		String c=a+" "+b;
//		return c;
//	}
//	
//	
//	@GetMapping("display")
//	public ModelAndView display()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("name","JFSD");
//		return mv;
//	}
//	
//	@GetMapping("mul")
//	@ResponseBody
//	public ModelAndView mul(@RequestParam("x")  int a,@RequestParam("y")  int b)
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("output");
//		mv.addObject("result", a*b);
//		return mv;
//	}
//	
//	@GetMapping("show/{fname}/{lname}")
//	
//	public ModelAndView show(@PathVariable("fname")  String a,@PathVariable("lname")  String b)
//	{
//		String c=a+" "+b;
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("show");
//		mv.addObject("fname",a);
//		mv.addObject("lname",b);
//		mv.addObject("name",c);
//		
//		return mv;
//	}
//	
//}
