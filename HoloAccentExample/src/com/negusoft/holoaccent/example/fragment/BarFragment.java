package com.negusoft.holoaccent.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.negusoft.holoaccent.example.R;

public class BarFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.bars, null);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		getActivity().findViewById(R.id.myseekbar).setEnabled(false);
	}

}
