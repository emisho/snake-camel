package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Test {
	/*
	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@org.junit.Test
	public void スネークケースの文字列をキャメルケースに変換できる(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "MikkyMouse";
	    String actual = snake.snakeToCamelcase("mikky_mouse");
		assertThat(actual,is(expected));	
	}

	@org.junit.Test
	public void キャメルケースの文字列をスネークケースに変換できる(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "minnie_mouse";
	    String actual = snake.camelToSnakecase("MinnieMouse");
		assertThat(actual,is(expected));	
	}

	@org.junit.Test
	public void 一文字目を大文字に変換できている(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Mikky";
	    String actual = snake.capitalize("mikky");
		assertThat(actual,is(expected));
	}
	
	@org.junit.Test
	public void 一文字目を小文字に変換できている(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "mikky";
	    String actual = snake.uncapitalize("mikky");
		assertThat(actual,is(expected));
	}
}
