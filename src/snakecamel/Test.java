package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Test {
	
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
	
	//capitalize()
	@org.junit.Test
	public void capitalizeで空文字から空文字に変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "　";
	    String actual = snake.capitalize("　");
		assertThat(actual,is(expected));
	}
	
	@org.junit.Test
	public void aからAに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "A";
	    String actual = snake.capitalize("a");
		assertThat(actual,is(expected));
	}
	
	@org.junit.Test
	public void xyzからXyzに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Xyz";
	    String actual = snake.capitalize("xyz");
		assertThat(actual,is(expected));
	}
	
	//uncapitalize()
	@org.junit.Test
	public void uncapitalizeで空文字から空文字に変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "　";
	    String actual = snake.uncapitalize("　");
		assertThat(actual,is(expected));
	}
	
	@org.junit.Test
	public void Aからaに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "a";
	    String actual = snake.uncapitalize("A");
		assertThat(actual,is(expected));
	}
	
	@org.junit.Test
	public void Xyzからxyzに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "xyz";
	    String actual = snake.uncapitalize("Xyz");
		assertThat(actual,is(expected));
	}
	
	//snakeToCamelcase
	@org.junit.Test
	public void abcからAbcに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Abc";
	    String actual = snake.snakeToCamelcase("abc");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void abc_defからAbc_Defに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
	    String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void abc_def_ghからAbcDefGhに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGh";
	    String actual = snake.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void abc__def__ghからAbcDefGhに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGh";
	    String actual = snake.snakeToCamelcase("abc__def___gh");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void _abc_def__からAbcDefに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
	    String actual = snake.snakeToCamelcase("_abc_def__");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void Abcからabcに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc";
	    String actual = snake.camelToSnakecase("Abc");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void AbcDefからabc_defに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def";
	    String actual = snake.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));	
	}
	
	@org.junit.Test
	public void AbcDefGhからabc_def_ghに変換できるか(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def_gh";
	    String actual = snake.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expected));	
	}
}
