package ifsc.pedro.menezes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ArrayAdapterFrutas extends ArrayAdapter {
    Context mycontext;
    int myresource;

    public ArrayAdapterFrutas(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        mycontext = context;
        myresource = resource;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mycontext);
        @SuppressLint("ViewHolder") View view = inflater.inflate(myresource, parent,false);

        TextView nome = view.findViewById(R.id.txtNome);
        TextView descricao = view.findViewById(R.id.txtDescricao);
        TextView preco = view.findViewById(R.id.txtPreco);
        ImageView imagem = view.findViewById(R.id.imagem);

        Fruta fruta = (Fruta) getItem(position);
        nome.setText("" + fruta.getNome());
        descricao.setText("" + fruta.getDescricao());
        preco.setText("R$ " + String.valueOf(fruta.getPreco()));
        imagem.setImageResource(fruta.getImagem());

        return view;
    }
}