package de.tinycodecrank.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class SingleElementIterator<T> implements Iterator<T>
{
	private final T element;
	private boolean hasNext = true;
	
	public SingleElementIterator(T element)
	{
		this.element = element;
	}
	@Override
	public boolean hasNext()
	{
		return hasNext;
	}

	@Override
	public T next()
	{
		if(hasNext())
		{
			hasNext = false;
			return element;
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
}