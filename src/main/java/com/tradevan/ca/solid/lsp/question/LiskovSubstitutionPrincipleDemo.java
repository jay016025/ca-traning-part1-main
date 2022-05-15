package com.tradevan.ca.solid.lsp.question;

public class LiskovSubstitutionPrincipleDemo {

	// question: 利用 LSP 方法, 修正鴕鳥(Ostrich) 在 runtime 的時候, 誤用 fly() 會拋出錯誤的問題
	public static void main(String[] args) {
		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
		for (Bird bird : birds) {
			bird.eat();
		}

		FlyBird[] flyBirds = new FlyBird[] {new Crow(), new Sparrow()};
		for(FlyBird fly : flyBirds)
			fly.fly();
	}

}
