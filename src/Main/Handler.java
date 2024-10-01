package Main;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Handler {
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	
	public void tick(){
		
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
		
	}
	public void render(Graphics g) {
		
		List<GameObject> tempList = new ArrayList<>(object);
		for(GameObject object : tempList) {
//			GameObject tempObject = object.get(i);
			
			object.render(g);
		}
	  }
	
		
		public void clearEnemys() {
			for(int i = 0; i < object.size(); i++) {
				GameObject tempObject = object.get(i);
				
				if(tempObject.getid() == ID.Player) {
					
					object.clear();
					if(Game.gameState != Game.STATE.End)
					addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player,this));
				}
			}
		}
		
	
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
	
}
