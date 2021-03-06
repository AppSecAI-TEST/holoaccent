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
package com.negusoft.holoaccent.interceptor;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.negusoft.holoaccent.AccentPalette;
import com.negusoft.holoaccent.AccentResources;
import com.negusoft.holoaccent.R;
import com.negusoft.holoaccent.drawable.UnderlineDrawable;

public class UnderlineInterceptor implements AccentResources.Interceptor {

	@Override
	public Drawable getDrawable(Resources res, AccentPalette palette, int resId) {
		if (resId == R.drawable.ha__underline_1_5_reference)
			return new UnderlineDrawable(res, palette.accentColor, 1.5f);
        if (resId == R.drawable.ha__underline_3_reference)
            return new UnderlineDrawable(res, palette.accentColor, 3f);
        if (resId == R.drawable.ha__underline_6_reference)
            return new UnderlineDrawable(res, palette.accentColor, 6f);
        if (resId == R.drawable.ha__ab_underline_6_reference)
            return new UnderlineDrawable(res, palette.accentColorActionBar, 6f);
		// overline
		if (resId == R.drawable.ha__overline_3_reference)
			return new UnderlineDrawable(res, palette.accentColor, 3f, true);
        // list separators
        if (resId == R.drawable.ha__underline_list_separator_reference)
            return new UnderlineDrawable(res, palette.getAccentColor(0xCC), 2f);
        if (resId == R.drawable.ha__underline_list_separator_dark_reference)
            return new UnderlineDrawable(res, palette.getDarkAccentColor(0xCC), 2f);
		return null;
	}

}
