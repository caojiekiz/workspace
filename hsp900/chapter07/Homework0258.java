package chapter07;

public class Homework0258 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new Music("aaa",300);
		music.play();
		System.out.println(music.getInfo());
	}

	}
	class Music {
		String name; 
		int times;
		public Music(String name, int times) {
			this.name = name;
			this.times = times;
		}
		public void play() {
			System.out.println("音乐" + this.name + "正在播放中...时长为" + this.times + "秒");
		}
		public String getInfo() {
			return "音乐" + this.name + "时长为" + this.times;
		}
		
	}