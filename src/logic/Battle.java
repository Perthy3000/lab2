package logic;

public class Battle {
	
	private Hero fighter[];
	
	public Battle(Hero a, Hero b) {
		fighter[0] = a;
		fighter[1] = b;
	}
	
	public void start() {
		System.out.println("==== Here Come A New Challenger ====");
		// TODO Show opening phrase -> Show challengers -> Repeat doBattleStep() -> Show result
		System.out.println("== " + fighter[0].getName() + " " + fighter[0].printStat() + " VS " + fighter[1].getName() + " " + fighter[1].printStat() + " ==\n");
	}

	public void doBattleStep() {
		// TODO FILL ME
		// First fighter Attack
		System.out.println(/* ATTACKER NAME */ + " do " + /* FILL DAMAGE HERE */ + " damage to " + /* TARGET NAME */);
		System.out.println(/* TARGET NAME */ + " has " + /* TARGET HP */ + " HP left\n");
		// Second fighter Attack
		System.out.println(/* ATTACKER NAME */ + " do " + /* FILL DAMAGE HERE */ + " damage to " + /* TARGET NAME */);
		System.out.println(/* TARGET NAME */ + " has " + /* TARGET HP */ + " HP left\n");
		if(/* CHECK IF FIRST FIGHTER IS DEFEATED */) {
			System.out.println(/* FILL NAME */ + " is knocked out\n");
		}
		if(/* CHECK IF SECOND FIGHTER IS DEFEATED */) {
			System.out.println(/* FILL NAME */ + " is knocked out\n");
		}
	}
	
	// TODO Fill me
	public void showResult() {
		if(/* FILL ME */) {
			System.out.println("== DRAW ==");
		}
		else if(/* FILL ME */) {
			System.out.println("== " + /* Winner's Name */ + " WIN ==");
		}
		else if(/* FILL ME */) {
			System.out.println("== " + /* Winner's Name */ + " WIN ==");
		}
	}
}
