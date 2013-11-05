package com.negusoft.holoaccent.intercepter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.negusoft.holoaccent.AccentPalette;
import com.negusoft.holoaccent.AccentResources;
import com.negusoft.holoaccent.R;
import com.negusoft.holoaccent.drawable.RoundRectDrawable;

public class RoundRectInterceptor implements AccentResources.Interceptor {

	private static final float BORDER_WIDTH_DP = 2f;
	private static final float CORNER_RADIUS_DP = 1.5f;
	private static final float BUTTION_GLOW_CORNER_RADIUS_DP = 5f;
	
	@Override
	public Drawable getDrawable(Resources res, AccentPalette palette, int resId) {
		if (resId == R.drawable.roundrect_check_pressed)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0x88), CORNER_RADIUS_DP);
		if (resId == R.drawable.roundrect_spinner_pressed)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0xAA), CORNER_RADIUS_DP);
		if (resId == R.drawable.roundrect_spinner_focussed)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0xAA), CORNER_RADIUS_DP, BORDER_WIDTH_DP);
		if (resId == R.drawable.roundrect_button_pressed_glow)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0x55), BUTTION_GLOW_CORNER_RADIUS_DP);
		if (resId == R.drawable.roundrect_button_pressed_fill)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.accentColor, CORNER_RADIUS_DP);
		if (resId == R.drawable.roundrect_button_pressed_fill_colored)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0x55), CORNER_RADIUS_DP);
		if (resId == R.drawable.roundrect_button_focused)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0xAA), CORNER_RADIUS_DP, BORDER_WIDTH_DP);
		if (resId == R.drawable.roundrect_button_disabled_focused)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.getTranslucent(0x55), CORNER_RADIUS_DP, BORDER_WIDTH_DP);
		if (resId == R.drawable.roundrect_button_normal_colored)
			return new RoundRectDrawable(res.getDisplayMetrics(), palette.accentColor, CORNER_RADIUS_DP);
		return null;
	}

}
