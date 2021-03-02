import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vermensajesclienteregistrado`
 *
 * VistaVermensajesclienteregistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaVermensajesclienteregistrado extends PolymerElement {

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
        return 'vista-vermensajesclienteregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVermensajesclienteregistrado.is, VistaVermensajesclienteregistrado);
