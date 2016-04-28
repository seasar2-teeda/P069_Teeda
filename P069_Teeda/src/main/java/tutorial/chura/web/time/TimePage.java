package tutorial.chura.web.time;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;

public class TimePage {

	@DateTimeConverter(type = "time")
	public Date initializedTime;
	@DateTimeConverter(type = "time")
	public Date prerenderedTime;
	public String fa  = "aaa";
	public String fa2 = "bbb";	//●こっちだと、HTMLの読み込み時にdddとでてくる。
	//public String fa2;		//●こっちだと、HTML読み込み時はなにも表示されない。
	public String fa3;			//javaScriptでvalueに入れたやつがこの変数に入ってくる。

	public Class<?> doSubmit() {
		
		//html側でjavascriptで値を同期するのはあきらめた。こっちでやればいいだろ。
		fa2 = fa;//●しかもこの処理「doSubmit()」を通らないと、代入が起こっていないのを発見できた。
		
		return null;
	}

	public Class<?> initialize() {
		initializedTime = new Date();
		return null;
	}

	public Class<?> prerender() {
		prerenderedTime = new Date();
		return null;
	}

}
