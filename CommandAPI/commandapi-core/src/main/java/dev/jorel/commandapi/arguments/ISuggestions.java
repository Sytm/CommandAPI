package dev.jorel.commandapi.arguments;

/**
 * Apparently rawtype warnings are unavoidable here. See
 * https://stackoverflow.com/questions/69491202/how-to-use-sealed-classes-with-generics
 */
@SuppressWarnings("rawtypes")
public sealed interface ISuggestions permits ArgumentSuggestions, SafeSuggestions {

}
