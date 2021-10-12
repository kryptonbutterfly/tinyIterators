package de.tinycodecrank.iterator;

import java.util.Iterator;
import java.util.List;

@FunctionalInterface
public interface ReverseIterable<T> extends Iterable<T>
{
	public static <T> ReverseIterable<T> reverse(List<T> list)
	{
		return () -> new Iterator<T>()
		{
			private int index = list.size() - 1;
			
			@Override
			public boolean hasNext()
			{
				return index >= 0;
			}
			
			@Override
			public T next()
			{
				return list.get(this.index--);
			}
		};
	}
	
	public static <T> ReverseIterable<T> reverse(T[] array)
	{
		return () -> new Iterator<T>()
		{
			private int index = array.length - 1;
			
			@Override
			public boolean hasNext()
			{
				return index >= 0;
			}
			
			@Override
			public T next()
			{
				return array[index--];
			}
		};
	}
}