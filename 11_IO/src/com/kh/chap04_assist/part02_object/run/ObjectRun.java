package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjcetDao;

public class ObjectRun {

	public static void main(String[] args) {
		ObjcetDao dao = new ObjcetDao();
		//dao.fileSave();
		dao.fileRead();
	}

}
