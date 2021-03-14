package nextstep.subway.line.ui;

import nextstep.subway.line.exception.DownStationExistedException;
import nextstep.subway.line.exception.HasNoneOrOneSectionException;
import nextstep.subway.line.exception.LineNotFoundException;
import nextstep.subway.line.exception.NotLastStationException;
import nextstep.subway.line.exception.NotValidUpStationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
public class LineExceptionHandler {

    @ExceptionHandler(LineNotFoundException.class)
    public void handle(HttpServletResponse response, LineNotFoundException e) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(NotValidUpStationException.class)
    public void handle(HttpServletResponse response, NotValidUpStationException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(DownStationExistedException.class)
    public void handle(HttpServletResponse response, DownStationExistedException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(HasNoneOrOneSectionException.class)
    public void handle(HttpServletResponse response, HasNoneOrOneSectionException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(NotLastStationException.class)
    public void handle(HttpServletResponse response, NotLastStationException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public void handle(HttpServletResponse response, DataIntegrityViolationException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
