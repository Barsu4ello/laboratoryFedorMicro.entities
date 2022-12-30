package com.cvetkov.fedor.laboratoryworkmicro.entities.mapper;

import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request.AuthorRequest;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response.AuthorResponse;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update.AuthorUpdate;
import com.cvetkov.fedor.laboratoryworkmicro.entities.model.Author;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AuthorMapper {

    private final ModelMapper mapper;

    public AuthorResponse authorToAuthorResponse(Author author) {
        return mapper.map(author, AuthorResponse.class);
    }

    public Author authorRequestToAuthor(AuthorRequest request) {
        return mapper.map(request, Author.class);
    }

    public Author authorUpdateToAuthor(AuthorUpdate update) {
        return mapper.map(update, Author.class);
    }

    public List<AuthorResponse> authorToAuthorResponseList(List<Author> author) {
        return author
                .stream()
                .map(this::authorToAuthorResponse)
                .collect(Collectors.toList());
    }

    public Page<AuthorResponse> authorToAuthorResponsePage(Page<Author> authorPage) {
        return authorPage
                .map(this::authorToAuthorResponse);
    }
}
