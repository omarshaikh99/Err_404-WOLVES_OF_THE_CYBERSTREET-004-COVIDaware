package com.wasim.covidaware;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MyItem implements ClusterItem {

    @NonNull
    @Override
    public LatLng getPosition() {
        return Position;
    }

    @Nullable
    @Override
    public String getTitle() {
        return null;
    }

    @Nullable
    @Override
    public String getSnippet() {
        return null;
    }

    private LatLng Position;

    public MyItem(LatLng position) {
        Position = position;
    }
}
