package com.nuocf.yshuobang.pool;

public interface ObjectPool<O> {

	public O acquire();
	public void release(O object);
	public void setMaxPoolSize(int size);
	public int getMaxPoolSize();
}
