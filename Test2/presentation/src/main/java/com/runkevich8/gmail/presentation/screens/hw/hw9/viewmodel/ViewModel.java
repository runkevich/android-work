//package com.runkevich8.gmail.presentation.screens.hw.hw9.viewmodel;
//
//import android.databinding.BaseObservable;
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.support.annotation.CallSuper;
//import android.support.annotation.Nullable;
//
//
//
//public class ViewModel extends BaseObservable {
//
//    protected ViewModel(@Nullable State savedInstanceState) {
//
//    }
//
//    @CallSuper
//    public void onStart() {
//
//    }
//
//    public State getInstanceState() {
//        return new State(this);
//    }
//
//    @CallSuper
//    public void onStop() {
//
//    }
//
//    public static class State implements Parcelable {
//
//        protected State(ViewModel viewModel) {
//
//        }
//
//        public State(Parcel in) {
//
//        }
//
//        @Override
//        public int describeContents() {
//            return 0;
//        }
//
//        @CallSuper
//        @Override
//        public void writeToParcel(Parcel dest, int flags) {
//
//        }
//
//        public static Creator<State> CREATOR = new Creator<State>() {
//            @Override
//            public State createFromParcel(Parcel source) {
//                return new State(source);
//            }
//
//            @Override
//            public State[] newArray(int size) {
//                return new State[size];
//            }
//        };
//    }
//}
//
