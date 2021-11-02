package com.tjupd.olympics.iterator;


import java.util.ArrayList;
import java.util.List;
/**
 * @author GaoShan
 * container的实体类 是纪念品Souvenir的List
 */
public class SouvenirRepository implements Container {
	
	public List<Souvenir> souvenirList = new ArrayList<Souvenir>();
	public SouvenirRepository(List<Souvenir> souvenirList){
		this.souvenirList = souvenirList;
	}
	
    public Iterator getIterator() {
       return new NameIterator();
    }
// NameIterator 实现 Iterator接口，用于返回next
    private class NameIterator implements Iterator {
    	 
        int index;
   
        public boolean hasNext() {
           if(index < souvenirList.size()){
              return true;
           }
           return false;
        }
   
        public Object next() {
           if(this.hasNext()){
              return souvenirList.get(index++);
           }
           return null;
        }     
     }

}
