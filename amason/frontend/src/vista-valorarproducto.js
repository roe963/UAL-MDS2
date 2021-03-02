import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-valorarproducto`
 *
 * VistaValorarproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaValorarproducto extends PolymerElement {

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
        return 'vista-valorarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValorarproducto.is, VistaValorarproducto);
