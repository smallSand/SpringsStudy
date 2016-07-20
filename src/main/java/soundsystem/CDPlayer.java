package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CDPlayer implements MediaPlayer {
	private CompactDics cd;
	
	@Autowired public CDPlayer(CompactDics cd){
		this.cd=cd;
	}
	@Override
	public void play() {
		cd.paly();
	}

}
