package thigk2.phamngocduy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class KyNiemAdapter extends RecyclerView.Adapter<KyNiemAdapter.KyNiemViewHolder> {

    private List<ActivityKyNiem> kyNiemList;
    private Context context;

    public KyNiemAdapter(Context context, List<ActivityKyNiem> kyNiemList) {
        this.context = context;
        this.kyNiemList = kyNiemList;
    }

    @NonNull
    @Override
    public KyNiemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ky_niem, parent, false);
        return new KyNiemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KyNiemViewHolder holder, int position) {
        ActivityKyNiem kyNiem = kyNiemList.get(position);
        holder.tvKyNiemName.setText(kyNiem.getName());
        holder.imgKyNiem.setImageResource(kyNiem.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, Item4Activity.class);
            intent.putExtra("item", kyNiem.getName());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return kyNiemList.size();
    }

    static class KyNiemViewHolder extends RecyclerView.ViewHolder {
        ImageView imgKyNiem;
        TextView tvKyNiemName;

        public KyNiemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgKyNiem = itemView.findViewById(R.id.imgKyNiem);
            tvKyNiemName = itemView.findViewById(R.id.tvKyNiemName);
        }
    }
}