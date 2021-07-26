def is_correct_brackets(text):
    while '()' in text or '[]' in text:
        text = text.replace('()', '')
        text = text.replace('[]', '')

    return not text


print(is_correct_brackets('[((())()(()))]'))  # мною была убрана одна квадратная скобка в конце и добавлена одна круглая закрывающая скобка также в конце
