package main.java.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class HkArrayList {
	ArrayList<String> ll = new ArrayList<>();
	private  Object[] elementData;
	private int size;
	
	//构造器
	public HkArrayList(){
		this.elementData=new Object[10];
	}
	
	public int size(){
		return size;
	}
	
	public boolean add(Object o){
		ensureCapacityInternal(size+1);
		elementData[size++]=o;
		return true;
	}
	
	//重载add方法通过下标来添加
	public boolean add(int index,Object o){
		rangeCheck(index);
		ensureCapacityInternal(size+1);
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]=o;
		size++;
		return true;
	}
	
	
	public Object get(int index) {
		rangeCheck(index);
        return elementData[index];
    }
	
	//检查给定下标是否符合规则
	private void rangeCheck(int index){
		if(index>size||index<0){
			throw new IndexOutOfBoundsException("下标有误，Index:"+index+",size:"+size);
		}
	}
	
	private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity - elementData.length > 0){
        	//需要的最小容量已经大于了数组的长度，此时需要扩容
        	int oldCapacity=elementData.length;
        	int newCapacity=(oldCapacity*3)/2;
        	//如果扩容1.5倍还不够，则将传入的长度为新长度
        	if (newCapacity - minCapacity < 0)
        		newCapacity=minCapacity;
        	elementData=Arrays.copyOf(elementData, newCapacity);
        }
            
    }

	@Override
	public String toString() {
		return "HkArrayList [elementData=" + Arrays.toString(elementData) + ", size=" + size + "]";
	}
	
	
	
	

}
