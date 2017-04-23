package chapter11;

import javax.sound.midi.*;

/**
 * Created by Administrator on 2017/4/18.
 */
public class MusicTest1 {
	public void play(){
		//ctrl + alt + T => surround with
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track t = seq.createTrack();

			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,44,100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			t.add(noteOn);

			ShortMessage b = new ShortMessage();
			a.setMessage(128,1,44,100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			t.add(noteOff);

			player.setSequence(seq);
			player.start();


			System.out.println("we got a sequencer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test() throws Exception{
		throw new Exception("exception message");
	}
	public static void main(String[] args){
		MusicTest1 mt = new MusicTest1();
		mt.play();
		//try {
		//	mt.test();
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}finally {
		//	System.out.println("finally do sth...");
		//}
		//
		//System.out.println("progress do sth...");
	}
}
