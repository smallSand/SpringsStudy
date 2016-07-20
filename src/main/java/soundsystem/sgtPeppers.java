package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class sgtPeppers implements CompactDics {
	
	private String title="Sgt. pepper's Lonely Hearts Club Band";
	private String artist="The beatles";
	@Override
	public void paly() {
		System.out.println("Playing "+ title +" By "+artist);
	}

}
