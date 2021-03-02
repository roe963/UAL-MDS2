import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verproducto`
 *
 * VistaVerproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaVerproducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-verproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerproducto.is, VistaVerproducto);
