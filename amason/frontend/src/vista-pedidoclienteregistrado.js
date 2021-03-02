import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidoclienteregistrado`
 *
 * VistaPedidoclienteregistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidoclienteregistrado extends PolymerElement {

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
        return 'vista-pedidoclienteregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoclienteregistrado.is, VistaPedidoclienteregistrado);
