package com.angular.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Readservlet extends HttpServlet {
	

	private static final long serialVersionUID = -2194029041197586770L;

	public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
		String r = "[{\"name\":\"Ashtavinayak Gruhsankool\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build1.jpg\"},{\"name\":\"Sai ram apartments\",\"about\":\"3 BHK, 3 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":3,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Mumbai\",\"price\":35,\"imgurl\":\"img/build2.jpg\"},{\"name\":\"Sri venkateshwara apartments\",\"about\":\"2 BHK, 2 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":2,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":75,\"imgurl\":\"img/build3.jpg\"},{\"name\":\"Sri ram villas\",\"about\":\"4 BHK, 4 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":4,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":75,\"imgurl\":\"img/build4.jpg\"},{\"name\":\"Vamshi ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build5.jpg\"},{\"name\":\"Tim ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build6.jpg\"},{\"name\":\"Indian ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build7.jpg\"},{\"name\":\"Hyderabad ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build8.jpg\"},{\"name\":\"Vibhav ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build9.jpg\"},{\"name\":\"Vinayaka ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Hyderabad\",\"price\":56,\"imgurl\":\"img/build1.jpg\"},{\"name\":\"Mahaveer ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Chennai \",\"price\":56,\"imgurl\":\"img/build2.jpg\"},{\"name\":\"Akshay ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":1,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Delhi\",\"price\":65,\"imgurl\":\"img/build3.jpg\"},{\"name\":\"Raghu ventures\",\"about\":\"1 BHK, 1 BHK +T are available in Adai, near Panvel.\",\"bedrooms\":3,\"phonenumber\":9491364189,\"email\":\"vamshi921@yahoo.com\",\"location\":\"Delhi\",\"price\":56,\"imgurl\":\"img/build4.jpg\"}]";
		response.getWriter().println(r);
	}

}
