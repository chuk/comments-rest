package com.matthewtomich.comments;

import com.google.inject.Binder;
import com.google.inject.Module;

public class CommentModule implements Module {

	@Override
	public void configure(Binder binder) {
		
		binder.bind(CommentResourse.class);
		binder.bind(ThreadResourse.class);
		
	     //binder.bind(Greeter.class).to(DefaultGreeter.class);
		
	}

}
