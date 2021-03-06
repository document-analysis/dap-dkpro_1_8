package org.dap.dap_dkpro_1_8.annotations;

import org.dap.data_structures.AnnotationContents;

/**
 * 
 *
 * <p>
 * Date: 10 Jul 2017
 * @author Asher Stern
 *
 */
public class Lemma extends AnnotationContents
{
	private static final long serialVersionUID = -2254298804408744535L;

	public Lemma(String value)
	{
		super();
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lemma other = (Lemma) obj;
		if (value == null)
		{
			if (other.value != null)
				return false;
		}
		else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Lemma [value=" + value + "]";
	}

	
	private final String value;
}
