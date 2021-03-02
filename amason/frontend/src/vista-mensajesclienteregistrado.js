import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-mensajesclienteregistrado`
 *
 * VistaMensajesclienteregistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaMensajesclienteregistrado extends PolymerElement {

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
        return 'vista-mensajesclienteregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajesclienteregistrado.is, VistaMensajesclienteregistrado);
