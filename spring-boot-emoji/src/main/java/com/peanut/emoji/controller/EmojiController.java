package com.peanut.emoji.controller;

import com.vdurmont.emoji.EmojiParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emoji")
public class EmojiController {

    @GetMapping("/parse")
    public String parseEmoji() {
        String text = "Hello :smile: :heart: :thumbsup:";
        return EmojiParser.parseToUnicode(text);
    }

    @GetMapping("/remove")
    public String removeEmoji() {
        String text = "Hello 😊 ❤️ 👍";
        return EmojiParser.removeAllEmojis(text);
    }

    @GetMapping("/alias")
    public String getAlias() {
        String text = "Hello 😊 ❤️ 👍";
        return EmojiParser.parseToAliases(text);
    }
} 