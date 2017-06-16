package com.example.ariel.shinheeapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ariel on 2017-06-16.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<MemberDTO> list = new ArrayList<>();

//0.리스트 채우기
    public MyAdapter() {
        this.list = list;
        list.add(new MemberDTO("ariel","ariel720@naver.com","good day", R.drawable.cupcake));
        list.add(new MemberDTO("test","test@naver.com","good night", R.drawable.donut));
        list.add(new MemberDTO("shinhee","shinhee@naver.com","good bye", R.drawable.eclair));
    }

    //1.item뷰를 뷰 홀더로 넘겨줌.
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_item,parent,false);

        return new MyViewHolder(view);
    }

    //4.뷰와 속성값 매칭
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        ((MyViewHolder)holder).ci_img.setImageResource(list.get(i).img);
        ((MyViewHolder)holder).tv_name.setText(list.get(i).name);
        ((MyViewHolder)holder).tv_msg.setText(list.get(i).msg);

    }
//3.배열의 크기 체크
    @Override
    public int getItemCount() {
        return list.size();
    }
    //2.뷰에있는 속성들 가져오기
    private class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView ci_img;
        TextView tv_name;
        TextView tv_msg;

        public MyViewHolder(View v) {
            super(v);
            ci_img= (CircleImageView) v.findViewById(R.id.ci_img);
            tv_msg = (TextView) v.findViewById(R.id.tv_msg);
            tv_name = (TextView) v.findViewById(R.id.tv_name);

        }
    };
}
