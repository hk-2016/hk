package main.java.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class HkArrayList {
	ArrayList<String> ll = new ArrayList<>();
	private  Object[] elementData;
	private int size;
	
	//������
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
	
	//����add����ͨ���±������
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
	
	//�������±��Ƿ���Ϲ���
	private void rangeCheck(int index){
		if(index>size||index<0){
			throw new IndexOutOfBoundsException("�±�����Index:"+index+",size:"+size);
		}
	}
	
	private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity - elementData.length > 0){
        	//��Ҫ����С�����Ѿ�����������ĳ��ȣ���ʱ��Ҫ����
        	int oldCapacity=elementData.length;
        	int newCapacity=(oldCapacity*3)/2;
        	//�������1.5�����������򽫴���ĳ���Ϊ�³���
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
