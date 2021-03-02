import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidosclienteregistrado`
 *
 * VistaPedidosclienteregistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosclienteregistrado extends PolymerElement {

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
        return 'vista-pedidosclienteregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosclienteregistrado.is, VistaPedidosclienteregistrado);
