/*******************************************************************************
 * Copyright 2013 NEGU Soft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.negusoft.holoaccent.drawable;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class RoundRectDrawable extends ShapeDrawable {
	
	private static Shape initShape(DisplayMetrics metrics, float cornerRadiusDp, float borderWidthDp) {
		float cornerRadiusPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, cornerRadiusDp, metrics);
		float[] coreners = new float[] { cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, 
				cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, cornerRadiusPx };
		float borderWidthPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, borderWidthDp, metrics);
		RectF inset = new RectF(borderWidthPx, borderWidthPx, borderWidthPx, borderWidthPx);
		return new RoundRectShape(coreners, inset, null);
	}
	
	private static Shape initShape(DisplayMetrics metrics, float cornerRadiusDp) {
		float cornerRadiusPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, cornerRadiusDp, metrics);
		float[] coreners = new float[] { cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, 
				cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, cornerRadiusPx, cornerRadiusPx };
		return new RoundRectShape(coreners, null, null);
	}
	
	public RoundRectDrawable(DisplayMetrics metrics, int fillColor, float cornerRadiusDp) {
		super(initShape(metrics, cornerRadiusDp));
		getPaint().setColor(fillColor);
	}
	
	public RoundRectDrawable(DisplayMetrics metrics, int fillColor, float cornerRadiusDp, float borderWidthDp) {
		super(initShape(metrics, cornerRadiusDp, borderWidthDp));
		getPaint().setColor(fillColor);
	}

}
