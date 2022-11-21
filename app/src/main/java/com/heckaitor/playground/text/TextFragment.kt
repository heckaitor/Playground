package com.heckaitor.playground.text

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class TextFragment : Fragment() {

    companion object {
        private const val KEY_TEXT = "TextFragment.Content"
        fun create(text: CharSequence) = TextFragment().also {
            it.arguments = bundleOf(KEY_TEXT to text)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = TextView(requireContext()).apply {
        text = arguments?.getCharSequence(KEY_TEXT) ?: "Nothing"
    }

}