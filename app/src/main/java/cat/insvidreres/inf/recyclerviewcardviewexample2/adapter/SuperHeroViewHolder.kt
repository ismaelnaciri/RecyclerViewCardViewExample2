package cat.insvidreres.inf.recyclerviewcardviewexample2.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import cat.insvidreres.inf.recyclerviewcardviewexample2.SuperHero
import cat.insvidreres.inf.recyclerviewcardviewexample2.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
    }
}