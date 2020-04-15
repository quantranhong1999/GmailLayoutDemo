package vn.hust.edu.otherlistbasedexamples;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.PorterDuff.Mode;
import java.util.Random;
import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;
    ColorFilter colorFilter = new ColorFilter();

    public ContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_3, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textFullname = view.findViewById(R.id.text_fullname);
            viewHolder.textRound = view.findViewById(R.id.text_round);
            viewHolder.imageAvatar = view.findViewById(R.id.image_avatar);
            viewHolder.imageFavorite = view.findViewById(R.id.image_favorite);
            viewHolder.des = view.findViewById(R.id.description);
            viewHolder.time = view.findViewById(R.id.time);
            viewHolder.title = view.findViewById(R.id.title);
            view.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) view.getTag();

        final ContactModel contact = contacts.get(i);
        viewHolder.imageAvatar.setImageResource(contact.getAvatarResource());
        viewHolder.textFullname.setText(contact.getFullname());
        viewHolder.textRound.setText(contact.getFullname().substring(0, 1));
        viewHolder.textRound.getBackground().setColorFilter(contact.getColor(), PorterDuff.Mode.SRC_ATOP);
        viewHolder.des.setText(contact.getDes());
        viewHolder.title.setText(contact.getTitle());
        viewHolder.time.setText(contact.getTime());

        if (contact.isSelected())
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        else
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);

        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSelected = contacts.get(i).isSelected;
                contacts.get(i).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return view;
    }

    class ViewHolder {
        ImageView imageAvatar;
        TextView textFullname;
        TextView textRound;
        ImageView imageFavorite;
        TextView time;
        TextView des;
        TextView title;
    }
}
