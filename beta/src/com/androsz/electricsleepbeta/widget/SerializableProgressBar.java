package com.androsz.electricsleepbeta.widget;

import java.io.Serializable;

import android.content.Context;
import android.widget.ProgressBar;

public class SerializableProgressBar extends ProgressBar implements
		Serializable {

	private static final long serialVersionUID = -2755645944654374920L;

	public SerializableProgressBar(Context context) {
		super(context);
	}

}