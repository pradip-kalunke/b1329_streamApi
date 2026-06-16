package com.tka;

public class DemoLive { // Server / AWS -- Capg --> Airtel / Jio/ Idea 

	public static void main(String[] args) {

		System.out.println("=====Airtel Network User ===========");
		NetworkGovt airtelUser = new AirtelNetwork();
		System.out.println(">>"+ airtelUser.toString()); // override{..}
		airtelUser.calling();

		System.out.println("\n=====jio Network User ===========");
		NetworkGovt jioUser = new JioNetwork();
		jioUser.calling();

		System.out.println("\n=====idea Network User ===========");
		NetworkGovt ideaUser = new IdeaNetwork();
		ideaUser.calling();

	}

}
